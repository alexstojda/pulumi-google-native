// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTopicPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicPlainArgs Empty = new GetTopicPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="topicId", required=true)
    private String topicId;

    public String topicId() {
        return this.topicId;
    }

    private GetTopicPlainArgs() {}

    private GetTopicPlainArgs(GetTopicPlainArgs $) {
        this.project = $.project;
        this.topicId = $.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicPlainArgs $;

        public Builder() {
            $ = new GetTopicPlainArgs();
        }

        public Builder(GetTopicPlainArgs defaults) {
            $ = new GetTopicPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder topicId(String topicId) {
            $.topicId = topicId;
            return this;
        }

        public GetTopicPlainArgs build() {
            $.topicId = Objects.requireNonNull($.topicId, "expected parameter 'topicId' to be non-null");
            return $;
        }
    }

}