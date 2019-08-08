<#ftl encoding='UTF-8'>
<html>
<head>

    <link href="/css/main.css" rel="stylesheet">

</head>
<body>


<!-- upload section -->
<div class="upload-container" style="text-align: center">

    <div class="form-style-2-heading">Имя пользователя: ${user.firstName}</div>
    <div class="form-style-2-heading">Фамилия пользователя: ${user.lastName}</div>

    <div class="upload-content">
        <div class="single-upload">
            <h3>Загрузить один файл</h3>
            <form id="singleUploadForm" name="singleUploadForm">
                <input id="singleFileUploadInput" type="file" name="file" class="file-input" required />
                <button type="submit" class="primary submit-btn">Получить ссылку</button>
            </form>
            <div class="upload-response">
                <div id="singleFileUploadError"></div>
                <div id="singleFileUploadSuccess"></div>
            </div>
        </div>


        <div class="multiple-upload">
            <h3>Загрузить несколько файлов</h3>
            <form id="multipleUploadForm" name="multipleUploadForm">
                <input id="multipleFileUploadInput" type="file" name="files" class="file-input" multiple required />
                <button type="submit" class="primary submit-btn">Получить ссылку</button>
            </form>
            <div class="upload-response">
                <div id="multipleFileUploadError"></div>
                <div id="multipleFileUploadSuccess"></div>
            </div>
        </div>
    </div>

    <div>
        <a href="/allDownloads">Просмотреть все файлы</a>
    </div>

    <a href="/logout">Выйти из хранилища</a>
</div>
<script src="/js/main.js" ></script>

</body>
</html>