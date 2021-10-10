<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RS</title>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Rumah Sakit Vita Insani</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Daftar Pasien</div>
    </div>
    <div class="panel-body">
     <form:form action="{namapasienMendaftar}" cssClass="form-horizontal"
      method="post" modelAttribute="Message">

      
      <form:hidden path="id" />

      <div class="form-group">
       <label for="id" class="col-md-3 control-label">ID Pasien : </label>
       <div class="col-md-9">
        <form:input path="id" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="nama" class="col-md-3 control-label">Nama : </label>
       <div class="col-md-9">
        <form:input path="jenis" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="noKtp" class="col-md-3 control-label">No KTP : </label>
       <div class="col-md-9">
        <form:input path="noKtp" cssClass="form-control" />
       </div>
       
       <div class="form-group">
       <label for="gender" class="col-md-3 control-label">Jenis Kelamin : </label>
       <div class="col-md-9">
        <form:input path="gender" cssClass="form-control" />
       </div>
       
       <div class="form-group">
       <label for="penyakit" class="col-md-3 control-label">Penyakit : </label>
       <div class="col-md-9">
        <form:input path="penyakit" cssClass="form-control" />
       </div>
       <div class="form-group">
       <label for="namaDokter" class="col-md-3 control-label">Nama Dokter : </label>
       <div class="col-md-9">
        <form:input path="namaDokter" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>