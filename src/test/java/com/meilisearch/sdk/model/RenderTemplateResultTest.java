package com.meilisearch.sdk.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import com.meilisearch.sdk.json.JacksonJsonHandler;
import org.junit.jupiter.api.Test;

class RenderTemplateResultTest {
    @Test
    void deserializesWithJacksonJsonHandler() throws Exception {
        RenderTemplateResult result =
                new JacksonJsonHandler()
                        .decode(
                                "{\"template\":\"Hello {{doc.name}}\",\"rendered\":\"Hello Movindu\"}",
                                RenderTemplateResult.class);

        assertThat(result.getTemplate(), is(equalTo("Hello {{doc.name}}")));
        assertThat(result.getRendered(), is(equalTo("Hello Movindu")));
    }
}
