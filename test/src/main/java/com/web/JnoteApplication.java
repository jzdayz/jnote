package com.web;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.codahale.metrics.servlets.AdminServlet;
import com.google.common.collect.ImmutableMap;
import okhttp3.*;
import okhttp3.EventListener;
import org.apache.ibatis.ognl.MemberAccess;
import org.apache.ibatis.plugin.Interceptor;
import org.junit.Test;
import org.marmelo.dropwizard.metrics.servlets.MetricsUIServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Nullable;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.reflect.Member;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.*;

//import static com.example.jnote.CustomSqlInjector.TABLE_NAME_PLACE_HOLDER;

@SpringBootApplication(scanBasePackages = "com")
@RestController
@MapperScan("com.pes.jd.mapper")
@ServletComponentScan("com.example.jnote")
public class JnoteApplication implements InitializingBean {

    /**
     * SQL执行效率插件
     */
    @Bean
//	@Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        final PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setWriteInLog(true);
        performanceInterceptor.setMaxTime(3000L);
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }

    /**
     * test condition
     */
    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(JnoteApplication.class);
        final ConfigurableApplicationContext context = springApplication.run(args);

        JnoteApplication bean = context.getBean(JnoteApplication.class);
    }

    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    @Inject
    private ConfigurationPropertiesBindingPostProcessor configurationPropertiesBindingPostProcessor;

    @Override
    public void afterPropertiesSet() throws Exception {
        TestProperty property = new TestProperty();
        final Object o = configurationPropertiesBindingPostProcessor
                .postProcessBeforeInitialization(property, "testProperty");
        System.out.println(o);
    }

    @Bean
    @ConfigurationProperties(prefix = "ss.ad")
    public TestProperty testProperty() {
        return new TestProperty();
    }


    private static class TestProperty {

        private String name;

        private String age;

        private static class Mode {
            private String modeName;

            public String getModeName() {
                return modeName;
            }

            public void setModeName(String modeName) {
                this.modeName = modeName;
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", Mode.class.getSimpleName() + "[", "]")
                        .add("modeName='" + modeName + "'")
                        .toString();
            }
        }

        private Mode mode;

        public Mode getMode() {
            return mode;
        }

        public void setMode(Mode mode) {
            this.mode = mode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", TestProperty.class.getSimpleName() + "[", "]")
                    .add("name='" + name + "'")
                    .add("age='" + age + "'")
                    .add("mode=" + mode)
                    .toString();
        }
    }


    @Bean
    public HealthCheckRegistry healthCheckRegistry() {
        return new HealthCheckRegistry();
    }

    @Bean
    public MetricRegistry metricRegistry() {
        return new MetricRegistry();
    }

    @Bean
    public ServletRegistrationBean metricsUIServlet() {
        return new ServletRegistrationBean(new MetricsUIServlet(), "/admin/*");
    }

    @GetMapping(AdminServlet.DEFAULT_HEALTHCHECK_URI)
    public void health(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(302);
        response.addHeader("location", "/sys" + AdminServlet.DEFAULT_HEALTHCHECK_URI);
    }

    @GetMapping(AdminServlet.DEFAULT_METRICS_URI)
    public void metrics(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(302);
        response.addHeader("location", "/sys" + AdminServlet.DEFAULT_METRICS_URI);
    }

    @GetMapping(AdminServlet.DEFAULT_PING_URI)
    public void ping(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(302);
        response.addHeader("location", "/sys" + AdminServlet.DEFAULT_PING_URI);
    }

    @GetMapping(AdminServlet.DEFAULT_THREADS_URI)
    public void threads(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(302);
        response.addHeader("location", "/sys" + AdminServlet.DEFAULT_THREADS_URI);
    }

    @GetMapping(AdminServlet.DEFAULT_CPU_PROFILE_URI)
    public void profile(HttpServletResponse response, HttpServletRequest request) {
        response.setStatus(302);
        response.addHeader("location", "/sys" + AdminServlet.DEFAULT_CPU_PROFILE_URI);
    }


    @Resource
    private MetricRegistry MetricRegistry;

    @RequestMapping("/h2")
    public void testH2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Meter rate = MetricRegistry.meter("h2 rate");
        rate.mark();
        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null) {
            pushBuilder.path("/a.png").addHeader("content-type", "image/png").push();
            try (PrintWriter respWriter = response.getWriter()) {
                respWriter.write("<html>" +
                        "<img src='/a.png'>" +
                        "</html>");
            }
        }
    }
    @Test
    public void testJsonP() {
        // Create Json and serialize
        JsonObject json = Json.createObjectBuilder()
                .add("name", "Falco")
                .add("age", BigDecimal.valueOf(3))
                .add("biteable", Boolean.FALSE).build();
        String result = json.toString();

        System.out.println(result);


        // Parse back
        final JsonParser parser = Json.createParser(new StringReader(result));
        Object key = null;
        Object value = null;
        while (parser.hasNext()) {
            final JsonParser.Event event = parser.next();
            switch (event) {
                case KEY_NAME:
                    key = parser.getString();
                    System.out.println(key);
                    break;
                case VALUE_STRING:
                    value = parser.getString();
                    System.out.println(value);
                    break;
                case VALUE_NUMBER:
                    value = parser.getInt();
                    System.out.println(value);
                    break;
                case VALUE_FALSE:
                    value = parser.getValue();
                    System.out.println(value);
                    break;
            }
        }
        parser.close();
    }


    @Test
    public void testUri() {
        final String s = UriComponentsBuilder.fromUriString("/get/performance").queryParam("a","b").toUriString();
        System.out.println(s);
    }

    @EnableConfigurationProperties(A.class)
    @ConfigurationProperties(prefix = "aa")
    @Configuration
    @ConditionalOnProperty(name = "aa.bb", havingValue = "1")
    public static class A {
        private String bb;

        public String getBb() {
            return bb;
        }

        public void setBb(String bb) {
            this.bb = bb;
        }

        @Override
        public String toString() {
            return "A{" +
                    "bb='" + bb + '\'' +
                    '}';
        }
    }

    @Test
    public void testMybatis() {
        final SpringApplication springApplication = new SpringApplication(JnoteApplication.class);
        springApplication.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        final ConfigurableApplicationContext context = springApplication.run(new String[]{});
//		final ReportPropertyMapper bean = context.getBean(ReportPropertyMapper.class);
//		final List<ReportProperty> reportProperties = bean.selectByExample(new ReportPropertyExample());
    }

    @Test
    public void testOgnl() throws Exception {
        class Can implements MemberAccess {

            @Override
            public Object setup(Map map, Object o, Member member, String s) {
                System.out.println("\nsetup\n");
                return null;
            }

            @Override
            public void restore(Map map, Object o, Member member, String s, Object o1) {
                System.out.println("\nrestore\n");
            }

            @Override
            public boolean isAccessible(Map map, Object o, Member member, String s) {
                System.out.println("\nisAccessible\n");
                return true;
            }
        }
//		Map<String,Object> root = new HashMap<>();
//		List<String> arrays = Arrays.asList("1","2");
//		root.put("a",arrays);
//		final Object parse = Ognl.parseExpression("a!=null and a.size()>0 and a.size() == 2");
//		System.out.println(String.format("parse ====== %s",parse));
//		final Map context = Ognl.createDefaultContext(root, new Can());
//		System.out.println(String.format("context ====== %s",context));
//		final Object value = Ognl.getValue(parse, context, root);
//		System.out.println(value);
    }


    @Test
    public void testOkHttp() throws Exception {
        OkHttpClient client = new OkHttpClient.Builder().eventListener(new EventListener() {

            @Override
            public void callStart(Call call) {
                System.out.println("callStart");
            }

            @Override
            public void dnsStart(Call call, String domainName) {
                System.out.println("dnsStart");
            }

            @Override
            public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
                System.out.println("dnsEnd");
            }

            @Override
            public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
                System.out.println("connectStart");
            }

            @Override
            public void secureConnectStart(Call call) {
                System.out.println("secureConnectStart");
            }

            @Override
            public void secureConnectEnd(Call call, @Nullable Handshake handshake) {
                System.out.println("secureConnectEnd");
            }

            @Override
            public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
                System.out.println("connectEnd");
            }

            @Override
            public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException ioe) {
                System.out.println("connectFailed");
            }

            @Override
            public void connectionAcquired(Call call, Connection connection) {
                System.out.println("connectionAcquired");
            }

            @Override
            public void connectionReleased(Call call, Connection connection) {
                System.out.println("connectionReleased");
            }

            @Override
            public void requestHeadersStart(Call call) {
                System.out.println("requestHeadersStart");
            }

            @Override
            public void requestHeadersEnd(Call call, Request request) {
                System.out.println("requestHeadersEnd");
            }

            @Override
            public void requestBodyStart(Call call) {
                System.out.println("requestBodyStart");
            }

            @Override
            public void requestBodyEnd(Call call, long byteCount) {
                System.out.println("requestBodyEnd");
            }

            @Override
            public void responseHeadersStart(Call call) {
                System.out.println("responseHeadersStart");
            }

            @Override
            public void responseHeadersEnd(Call call, Response response) {
                System.out.println("responseHeadersEnd");
            }

            @Override
            public void responseBodyStart(Call call) {
                System.out.println("responseBodyStart");
            }

            @Override
            public void responseBodyEnd(Call call, long byteCount) {
                System.out.println("responseBodyEnd");
            }

            @Override
            public void callEnd(Call call) {
                System.out.println("callEnd");
            }

            @Override
            public void callFailed(Call call, IOException ioe) {
                System.out.println("callFailed");
            }
        }).build();
        Request request = new Request.Builder().get().url("http://baidu.com").build();
        final Call call = client.newCall(request);
        final Response res = call.execute();
    }


}
