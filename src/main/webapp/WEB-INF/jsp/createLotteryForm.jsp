<html>
<header><title>This is title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</header>
<body>
<form action="/lottery" method="post">
    <div class="container">
        <div class="w-50 p-3">
            <div class="form-group">
                <label for="title">Title of lottery</label>
                <input name="title" class="form-control" placeholder="Please enter title">
            </div>
            <div class="form-group">
                <label for="limit">Max participiants</label>
                <input name="limit" class="form-control" placeholder="Enter max participiants">
            </div>
            <button type="submit" class="btn btn-success" onclick="createLottery()">Create</button>
            <button type="button" class="btn btn-secondary" onclick="window.location.href = '/lotteries'">Cancel</button>
        </div>
    </div>
</form>
</body>
</html>