package com.meilisearch.sdk.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RenderTemplateResult {
    Object template;
    Object rendered;

    public RenderTemplateResult() {}
}
