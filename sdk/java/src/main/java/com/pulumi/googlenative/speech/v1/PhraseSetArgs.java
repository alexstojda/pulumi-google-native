// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.speech.v1.inputs.PhraseArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PhraseSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PhraseSetArgs Empty = new PhraseSetArgs();

    /**
     * Hint Boost. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost values would correspond to anti-biasing. Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 (exclusive) and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
     */
    @Import(name="boost")
    private @Nullable Output<Double> boost;

    /**
     * @return Hint Boost. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost values would correspond to anti-biasing. Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 (exclusive) and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
     */
    public Optional<Output<Double>> boost() {
        return Optional.ofNullable(this.boost);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the phrase set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the phrase set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID to use for the phrase set, which will become the final component of the phrase set&#39;s resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
     * 
     */
    @Import(name="phraseSetId", required=true)
    private Output<String> phraseSetId;

    /**
     * @return The ID to use for the phrase set, which will become the final component of the phrase set&#39;s resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
     * 
     */
    public Output<String> phraseSetId() {
        return this.phraseSetId;
    }

    /**
     * A list of word and phrases.
     * 
     */
    @Import(name="phrases")
    private @Nullable Output<List<PhraseArgs>> phrases;

    /**
     * @return A list of word and phrases.
     * 
     */
    public Optional<Output<List<PhraseArgs>>> phrases() {
        return Optional.ofNullable(this.phrases);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private PhraseSetArgs() {}

    private PhraseSetArgs(PhraseSetArgs $) {
        this.boost = $.boost;
        this.location = $.location;
        this.name = $.name;
        this.phraseSetId = $.phraseSetId;
        this.phrases = $.phrases;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PhraseSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PhraseSetArgs $;

        public Builder() {
            $ = new PhraseSetArgs();
        }

        public Builder(PhraseSetArgs defaults) {
            $ = new PhraseSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param boost Hint Boost. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost values would correspond to anti-biasing. Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 (exclusive) and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
         * 
         * @return builder
         * 
         */
        public Builder boost(@Nullable Output<Double> boost) {
            $.boost = boost;
            return this;
        }

        /**
         * @param boost Hint Boost. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost values would correspond to anti-biasing. Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 (exclusive) and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
         * 
         * @return builder
         * 
         */
        public Builder boost(Double boost) {
            return boost(Output.of(boost));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the phrase set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the phrase set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phraseSetId The ID to use for the phrase set, which will become the final component of the phrase set&#39;s resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder phraseSetId(Output<String> phraseSetId) {
            $.phraseSetId = phraseSetId;
            return this;
        }

        /**
         * @param phraseSetId The ID to use for the phrase set, which will become the final component of the phrase set&#39;s resource name. This value should restrict to letters, numbers, and hyphens, with the first character a letter, the last a letter or a number, and be 4-63 characters.
         * 
         * @return builder
         * 
         */
        public Builder phraseSetId(String phraseSetId) {
            return phraseSetId(Output.of(phraseSetId));
        }

        /**
         * @param phrases A list of word and phrases.
         * 
         * @return builder
         * 
         */
        public Builder phrases(@Nullable Output<List<PhraseArgs>> phrases) {
            $.phrases = phrases;
            return this;
        }

        /**
         * @param phrases A list of word and phrases.
         * 
         * @return builder
         * 
         */
        public Builder phrases(List<PhraseArgs> phrases) {
            return phrases(Output.of(phrases));
        }

        /**
         * @param phrases A list of word and phrases.
         * 
         * @return builder
         * 
         */
        public Builder phrases(PhraseArgs... phrases) {
            return phrases(List.of(phrases));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public PhraseSetArgs build() {
            $.phraseSetId = Objects.requireNonNull($.phraseSetId, "expected parameter 'phraseSetId' to be non-null");
            return $;
        }
    }

}