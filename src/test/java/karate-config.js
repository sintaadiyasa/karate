function fn() {
    var env = karate.env;
    var config = {
        urlBase: 'https://graphqlzero.almansi.me/api',
        basicAuth: 'https://graphqlzero.almansi.me/api',
    };
    switch (env) {
        case 'development':
            config.urlBase = 'https://graphqlzero.almansi.me/api';
            config.basicAuth = '';
            break;
        case 'staging':
            config.urlBase = 'https://graphqlzero.almansi.me/api';
            config.basicAuth = '';
            break;
        case 'ci_development':
            config.urlBase = 'http://localhost:1111/graphql';
            config.basicAuth = '';
            break;
        case 'ci_staging':
            config.urlBase = 'http://localhost:2222/graphql';
            config.basicAuth = '';
            break;
    }
    karate.configure('connectTimeout', 60000);
    karate.configure('readTimeout', 60000);
    return config;
}