<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="false" session="false" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<my:template title="Detail of revision number: ${revision.id}">
<jsp:attribute name="body">

    <h1>Detail of revision <c:out value="${revision.id}" /></h1>

    <table class="table table-striped">
        <tr>
            <td>ID</td>
            <td><c:out value="${revision.id}" /></td>
        </tr>
        <tr>
            <td>Revision Date</td>
            <td><c:out value="${revision.revisionDate}" /></td>
        </tr>
        <tr>
            <td>Machine of Revision</td>
            <td><c:out value="${revision.machine}" /></td>
        </tr>

        
    </table>

</jsp:attribute>
</my:template>



