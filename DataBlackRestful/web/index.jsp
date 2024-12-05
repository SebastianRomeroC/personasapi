<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">

    <servlet>
        <servlet-name>BlacklistServlet</servlet-name>
        <servlet-class>com.example.datablackrestful.web.BlacklistServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>BlacklistServlet</servlet-name>
        <url-pattern>/addBlacklist</url-pattern>
    </servlet-mapping>

    <servlet>
        <servlet-name>DatacreditoServlet</servlet-name>
        <servlet-class>com.example.datablackrestful.web.DatacreditoServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>DatacreditoServlet</servlet-name>
        <url-pattern>/addDatacredito</url-pattern>
    </servlet-mapping>

    <servlet>
        <servlet-name>VerificarCodigoServlet</servlet-name>
        <servlet-class>com.example.datablackrestful.web.VerificarCodigoServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>VerificarCodigoServlet</servlet-name>
        <url-pattern>/verificarCodigo</url-pattern>
    </servlet-mapping>
</web-app>
