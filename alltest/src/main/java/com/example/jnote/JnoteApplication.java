package com.example.jnote;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pes.jd.mapper.CsChatSessionMapper;
import com.pes.jd.mapper.PesReportCategoryMapper;
import com.pes.jd.model.DO.CsChatSession;
import com.pes.jd.model.DO.CsChatSessionExample;
import com.pes.jd.model.DO.PesReportCategory;
import com.sun.deploy.net.proxy.ProxyUtils;
import okhttp3.*;
import okhttp3.EventListener;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.jdbc.PreparedStatementLogger;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.ognl.MemberAccess;
import org.apache.ibatis.ognl.Ognl;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.Transaction;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ResolvableType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Nullable;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

@SpringBootApplication
@RestController
@MapperScan("com.pes.jd.mapper")
public class JnoteApplication {

	/**
	 *  test condition
	 */
	public static void main(String[] args) {
		args = new String[]{"--aa.bb=1"};
		final SpringApplication springApplication = new SpringApplication(JnoteApplication.class);
		springApplication.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		final ConfigurableApplicationContext context = springApplication.run(args);
//		System.out.println(context.getEnvironment().getProperty("aa.bb"));
//		final Map<String, A> bean = context.getBeansOfType(A.class);
//		System.out.println(bean);

		PesReportCategory category = new PesReportCategory();
		category.setName("ssss");
		category.setStatus((byte) 1);
		category.setTitle("ssssd");
		context.getBean(PesReportCategoryMapper.class).insert(category);

		System.out.println(category.getId());



//		CsChatSessionMapper bean1 = context.getBean(CsChatSessionMapper.class);
//		CsChatSessionExample example = new CsChatSessionExample();
//		example.createCriteria().andAvgRespTimeBetween(1D,2D);
//		List<CsChatSession> csChatSessions = bean1.selectByExample(example);
//		System.out.println(csChatSessions);
//
//
//		final AwareTest bean =
//				context.getBean(AwareTest.class);

		context.close();

	}

	@Test
	public void testShell() throws Exception{
		String shell = "\n" +
				"REPOSITORY_PATH=/Users/huqingfeng/.m2/repository\n" +
				"echo 正在搜索...\n" +
				"find $REPOSITORY_PATH -name \"*lastUpdated*\" | xargs rm -fr\n";
		System.out.println(shell);
//		final Process exec = Runtime.getRuntime().exec(shell);
//		try (
//				Closer closer = Closer.create()
//				){
//			final InputStream inputStream = closer.register(exec.getInputStream());
//			System.out.println(StreamUtils.copyToString(inputStream, Charset.defaultCharset())+"\n OVER");
//		}

	}

	@Test
	public void testResolverable(){
		Map<String,Integer> map = new HashMap<>();
		final ResolvableType resolvableType = ResolvableType.forClass(TestMap.class);
		System.out.println();
	}

	private  static class TestMap extends AbstractMap<String,Object>{

		@Override
		public Set<Entry<String, Object>> entrySet() {
			return null;
		}
	}


	public static class Student{
		@NotEmpty(message = "用户名不可以为空")
		private String name;
		@NotNull(message = "年龄不可以为空")
		private Integer age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
	}

	@RequestMapping("/")
	public Object testMvc(String[] str){
		try {
			return new ObjectMapper().writeValueAsString(str);
		} catch (JsonProcessingException e) {
			return "NONE";
		}
	}

	@Test
	public void testJsonP(){
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
	public void testUri(){
		final String s = UriComponentsBuilder.fromUriString("/get/performance?shop={0}&person={0}").buildAndExpand("\t",123).toUriString();
		System.out.println(s);
	}

	@Test
	public void testA(){
		Map<String,Map<String,Object>> aa = new HashMap<>();
		final Map<String, Object> aa1 = aa(aa);
		System.out.println(aa1);
	}

	private Map<String,Object> aa(Map<?, ?> aa) {
		return (Map<String,Object>) aa;
	}

	@EnableConfigurationProperties(A.class)
	@ConfigurationProperties(prefix = "aa")
	@Configuration
	@ConditionalOnProperty(name = "aa.bb",havingValue = "1")
	public static class A{
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
	public void testMybatis(){
		final SpringApplication springApplication = new SpringApplication(JnoteApplication.class);
		springApplication.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		final ConfigurableApplicationContext context = springApplication.run(new String[]{});
//		final ReportPropertyMapper bean = context.getBean(ReportPropertyMapper.class);
//		final List<ReportProperty> reportProperties = bean.selectByExample(new ReportPropertyExample());
	}

	@Test
	public void testOgnl() throws Exception{
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
		Map<String,Object> root = new HashMap<>();
		List<String> arrays = Arrays.asList("1","2");
		root.put("a",arrays);
		final Object parse = Ognl.parseExpression("a!=null and a.size()>0 and a.size() == 2");
		System.out.println(String.format("parse ====== %s",parse));
		final Map context = Ognl.createDefaultContext(root, new Can());
		System.out.println(String.format("context ====== %s",context));
		final Object value = Ognl.getValue(parse, context, root);
		System.out.println(value);
	}



	@Test
	public void testOkHttp() throws Exception{
		OkHttpClient client = new OkHttpClient.Builder().eventListener(new EventListener(){

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

	@Test
	public void test(){
		String flag = "record.";
		StringBuilder str = new StringBuilder("<set >\n" +
				"      <if test=\"sid != null\" >\n" +
				"        sid = #{sid,jdbcType=VARCHAR},\n" +
				"      </if>\n" +
				"      <if test=\"shopId != null\" >\n" +
				"        shop_id = #{shopId,jdbcType=BIGINT},\n" +
				"      </if>\n" +
				"      <if test=\"date != null\" >\n" +
				"        date = #{date,jdbcType=DATE},\n" +
				"      </if>\n" +
				"      <if test=\"csNick != null\" >\n" +
				"        cs_nick = #{csNick,jdbcType=VARCHAR},\n" +
				"      </if>\n" +
				"      <if test=\"customer != null\" >\n" +
				"        customer = #{customer,jdbcType=VARCHAR},\n" +
				"      </if>\n" +
				"      <if test=\"beginDatetime != null\" >\n" +
				"        begin_datetime = #{beginDatetime,jdbcType=TIMESTAMP},\n" +
				"      </if>\n" +
				"      <if test=\"endDatetime != null\" >\n" +
				"        end_datetime = #{endDatetime,jdbcType=TIMESTAMP},\n" +
				"      </if>\n" +
				"      <if test=\"replyDatetime != null\" >\n" +
				"        reply_datetime = #{replyDatetime,jdbcType=TIMESTAMP},\n" +
				"      </if>\n" +
				"      <if test=\"sessionType != null\" >\n" +
				"        session_type = #{sessionType,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"isTransfer != null\" >\n" +
				"        is_transfer = #{isTransfer,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"isNonReply != null\" >\n" +
				"        is_non_reply = #{isNonReply,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"isSlowResp != null\" >\n" +
				"        is_slow_resp = #{isSlowResp,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"isLongReceive != null\" >\n" +
				"        is_long_receive = #{isLongReceive,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"sendEvalNum != null\" >\n" +
				"        send_eval_num = #{sendEvalNum,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"evalNum != null\" >\n" +
				"        eval_num = #{evalNum,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"evalCode != null\" >\n" +
				"        eval_code = #{evalCode,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"satisfiedEvalNum != null\" >\n" +
				"        satisfied_eval_num = #{satisfiedEvalNum,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"isConsult != null\" >\n" +
				"        is_consult = #{isConsult,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"isReceive != null\" >\n" +
				"        is_receive = #{isReceive,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"isAssign != null\" >\n" +
				"        is_assign = #{isAssign,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"sessionDurationTime != null\" >\n" +
				"        session_duration_time = #{sessionDurationTime,jdbcType=DOUBLE},\n" +
				"      </if>\n" +
				"      <if test=\"avgRespTimeFirst != null\" >\n" +
				"        avg_resp_time_first = #{avgRespTimeFirst,jdbcType=DOUBLE},\n" +
				"      </if>\n" +
				"      <if test=\"avgRespTime != null\" >\n" +
				"        avg_resp_time = #{avgRespTime,jdbcType=DOUBLE},\n" +
				"      </if>\n" +
				"      <if test=\"csChatNum != null\" >\n" +
				"        cs_chat_num = #{csChatNum,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"custChatNum != null\" >\n" +
				"        cust_chat_num = #{custChatNum,jdbcType=INTEGER},\n" +
				"      </if>\n" +
				"      <if test=\"receiveStartType != null\" >\n" +
				"        receive_start_type = #{receiveStartType,jdbcType=BIT},\n" +
				"      </if>\n" +
				"      <if test=\"forwardType != null\" >\n" +
				"        forward_type = #{forwardType,jdbcType=BIT},\n" +
				"      </if>\n" +
				"    </set>");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#' && str.charAt(i+1) == '{'){
				str.insert(i+2,flag);
			}
		}
		System.out.println("\n\n\n");
		System.out.println(str);
		System.out.println("\n\n\n");
	}



}
