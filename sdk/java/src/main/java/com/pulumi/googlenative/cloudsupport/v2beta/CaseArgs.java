// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsupport.v2beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsupport.v2beta.enums.CasePriority;
import com.pulumi.googlenative.cloudsupport.v2beta.enums.CaseSeverity;
import com.pulumi.googlenative.cloudsupport.v2beta.inputs.ActorArgs;
import com.pulumi.googlenative.cloudsupport.v2beta.inputs.CaseClassificationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaseArgs Empty = new CaseArgs();

    /**
     * The issue classification applicable to this case.
     * 
     */
    @Import(name="classification")
    private @Nullable Output<CaseClassificationArgs> classification;

    /**
     * @return The issue classification applicable to this case.
     * 
     */
    public Optional<Output<CaseClassificationArgs>> classification() {
        return Optional.ofNullable(this.classification);
    }

    /**
     * The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
     */
    @Import(name="creator")
    private @Nullable Output<ActorArgs> creator;

    /**
     * @return The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
     */
    public Optional<Output<ActorArgs>> creator() {
        return Optional.ofNullable(this.creator);
    }

    /**
     * A broad description of the issue.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A broad description of the issue.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The short summary of the issue reported in this case.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The short summary of the issue reported in this case.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Whether the case is currently escalated.
     * 
     */
    @Import(name="escalated")
    private @Nullable Output<Boolean> escalated;

    /**
     * @return Whether the case is currently escalated.
     * 
     */
    public Optional<Output<Boolean>> escalated() {
        return Optional.ofNullable(this.escalated);
    }

    /**
     * The resource name for the case.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the case.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority of this case. If this is set, do not set severity.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<CasePriority> priority;

    /**
     * @return The priority of this case. If this is set, do not set severity.
     * 
     */
    public Optional<Output<CasePriority>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the project associated with the case.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project associated with the case.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The severity of this case. Deprecated. Use priority instead.
     * 
     * @deprecated
     * The severity of this case. Deprecated. Use priority instead.
     * 
     */
    @Deprecated /* The severity of this case. Deprecated. Use priority instead. */
    @Import(name="severity")
    private @Nullable Output<CaseSeverity> severity;

    /**
     * @return The severity of this case. Deprecated. Use priority instead.
     * 
     * @deprecated
     * The severity of this case. Deprecated. Use priority instead.
     * 
     */
    @Deprecated /* The severity of this case. Deprecated. Use priority instead. */
    public Optional<Output<CaseSeverity>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The email addresses to receive updates on this case.
     * 
     */
    @Import(name="subscriberEmailAddresses")
    private @Nullable Output<List<String>> subscriberEmailAddresses;

    /**
     * @return The email addresses to receive updates on this case.
     * 
     */
    public Optional<Output<List<String>>> subscriberEmailAddresses() {
        return Optional.ofNullable(this.subscriberEmailAddresses);
    }

    /**
     * Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
     */
    @Import(name="testCase")
    private @Nullable Output<Boolean> testCase;

    /**
     * @return Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
     */
    public Optional<Output<Boolean>> testCase() {
        return Optional.ofNullable(this.testCase);
    }

    /**
     * The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    @Import(name="v2betaId1", required=true)
    private Output<String> v2betaId1;

    public Output<String> v2betaId1() {
        return this.v2betaId1;
    }

    @Import(name="v2betumId", required=true)
    private Output<String> v2betumId;

    public Output<String> v2betumId() {
        return this.v2betumId;
    }

    private CaseArgs() {}

    private CaseArgs(CaseArgs $) {
        this.classification = $.classification;
        this.creator = $.creator;
        this.description = $.description;
        this.displayName = $.displayName;
        this.escalated = $.escalated;
        this.name = $.name;
        this.priority = $.priority;
        this.project = $.project;
        this.severity = $.severity;
        this.subscriberEmailAddresses = $.subscriberEmailAddresses;
        this.testCase = $.testCase;
        this.timeZone = $.timeZone;
        this.v2betaId1 = $.v2betaId1;
        this.v2betumId = $.v2betumId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaseArgs $;

        public Builder() {
            $ = new CaseArgs();
        }

        public Builder(CaseArgs defaults) {
            $ = new CaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classification The issue classification applicable to this case.
         * 
         * @return builder
         * 
         */
        public Builder classification(@Nullable Output<CaseClassificationArgs> classification) {
            $.classification = classification;
            return this;
        }

        /**
         * @param classification The issue classification applicable to this case.
         * 
         * @return builder
         * 
         */
        public Builder classification(CaseClassificationArgs classification) {
            return classification(Output.of(classification));
        }

        /**
         * @param creator The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable Output<ActorArgs> creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param creator The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
         * 
         * @return builder
         * 
         */
        public Builder creator(ActorArgs creator) {
            return creator(Output.of(creator));
        }

        /**
         * @param description A broad description of the issue.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A broad description of the issue.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The short summary of the issue reported in this case.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The short summary of the issue reported in this case.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param escalated Whether the case is currently escalated.
         * 
         * @return builder
         * 
         */
        public Builder escalated(@Nullable Output<Boolean> escalated) {
            $.escalated = escalated;
            return this;
        }

        /**
         * @param escalated Whether the case is currently escalated.
         * 
         * @return builder
         * 
         */
        public Builder escalated(Boolean escalated) {
            return escalated(Output.of(escalated));
        }

        /**
         * @param name The resource name for the case.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the case.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of this case. If this is set, do not set severity.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<CasePriority> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this case. If this is set, do not set severity.
         * 
         * @return builder
         * 
         */
        public Builder priority(CasePriority priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param project The ID of the project associated with the case.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project associated with the case.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param severity The severity of this case. Deprecated. Use priority instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The severity of this case. Deprecated. Use priority instead.
         * 
         */
        @Deprecated /* The severity of this case. Deprecated. Use priority instead. */
        public Builder severity(@Nullable Output<CaseSeverity> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The severity of this case. Deprecated. Use priority instead.
         * 
         * @return builder
         * 
         * @deprecated
         * The severity of this case. Deprecated. Use priority instead.
         * 
         */
        @Deprecated /* The severity of this case. Deprecated. Use priority instead. */
        public Builder severity(CaseSeverity severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param subscriberEmailAddresses The email addresses to receive updates on this case.
         * 
         * @return builder
         * 
         */
        public Builder subscriberEmailAddresses(@Nullable Output<List<String>> subscriberEmailAddresses) {
            $.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }

        /**
         * @param subscriberEmailAddresses The email addresses to receive updates on this case.
         * 
         * @return builder
         * 
         */
        public Builder subscriberEmailAddresses(List<String> subscriberEmailAddresses) {
            return subscriberEmailAddresses(Output.of(subscriberEmailAddresses));
        }

        /**
         * @param subscriberEmailAddresses The email addresses to receive updates on this case.
         * 
         * @return builder
         * 
         */
        public Builder subscriberEmailAddresses(String... subscriberEmailAddresses) {
            return subscriberEmailAddresses(List.of(subscriberEmailAddresses));
        }

        /**
         * @param testCase Whether this case was created for internal API testing and should not be acted on by the support team.
         * 
         * @return builder
         * 
         */
        public Builder testCase(@Nullable Output<Boolean> testCase) {
            $.testCase = testCase;
            return this;
        }

        /**
         * @param testCase Whether this case was created for internal API testing and should not be acted on by the support team.
         * 
         * @return builder
         * 
         */
        public Builder testCase(Boolean testCase) {
            return testCase(Output.of(testCase));
        }

        /**
         * @param timeZone The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public Builder v2betaId1(Output<String> v2betaId1) {
            $.v2betaId1 = v2betaId1;
            return this;
        }

        public Builder v2betaId1(String v2betaId1) {
            return v2betaId1(Output.of(v2betaId1));
        }

        public Builder v2betumId(Output<String> v2betumId) {
            $.v2betumId = v2betumId;
            return this;
        }

        public Builder v2betumId(String v2betumId) {
            return v2betumId(Output.of(v2betumId));
        }

        public CaseArgs build() {
            $.v2betaId1 = Objects.requireNonNull($.v2betaId1, "expected parameter 'v2betaId1' to be non-null");
            $.v2betumId = Objects.requireNonNull($.v2betumId, "expected parameter 'v2betumId' to be non-null");
            return $;
        }
    }

}