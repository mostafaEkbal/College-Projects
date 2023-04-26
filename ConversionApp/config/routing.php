<?php

$routes = [];

route('/', function () {
    include("$_SERVER[DOCUMENT_ROOT]/Pages/Home.php");
});

route('/login', function () {
    include("$_SERVER[DOCUMENT_ROOT]/Pages/Interior_Page1.php");
});

route('/about-us', function () {
    include("$_SERVER[DOCUMENT_ROOT]/Pages/About_Us.php");
});

route('/404', function () {
    echo "Page not found";
});

function route(string $path, callable $callback)
{
    global $routes;
    $routes[$path] = $callback;
}

run();

function run()
{
    global $routes;
    $uri = $_SERVER['REQUEST_URI'];
    $found = false;
    foreach ($routes as $path => $callback) {
        if ($path !== $uri)
            continue;

        $found = true;
        $callback();
    }

    if (!$found) {
        $notFoundCallback = $routes['/404'];
        $notFoundCallback();
    }
}