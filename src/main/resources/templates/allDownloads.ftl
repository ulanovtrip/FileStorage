<#ftl encoding='UTF-8'>

<html>
<head>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>

<body>

<div class="form-style-2" style="text-align: center">

    <div class="form-style-2-heading">
        Загруженные ранее файлы
    </div>

    <table border="2">
        <#list files as file>

            <tr>
                <td>
                    <a href="/allDownloads">${file}</a>
                </td>
            </tr>
        </#list>
    </table>

<div>
    <td>
        <a href="/"><button>К загрузке файлов</button></a>
    </td>
</div>

   <div>
       <td>
           <a href="/logout"><button>LogOut</button></a>
       </td>
   </div>

</div>
</body>
</html>