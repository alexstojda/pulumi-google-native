// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.inputs.KnowledgeBaseArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsDetailArgs Empty = new WindowsDetailArgs();

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    @Import(name="cpeUri", required=true)
    private Output<String> cpeUri;

    /**
     * @return The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    public Output<String> cpeUri() {
        return this.cpeUri;
    }

    /**
     * The description of this vulnerability.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this vulnerability.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
     * 
     */
    @Import(name="fixingKbs", required=true)
    private Output<List<KnowledgeBaseArgs>> fixingKbs;

    /**
     * @return The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
     * 
     */
    public Output<List<KnowledgeBaseArgs>> fixingKbs() {
        return this.fixingKbs;
    }

    /**
     * The name of this vulnerability.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this vulnerability.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WindowsDetailArgs() {}

    private WindowsDetailArgs(WindowsDetailArgs $) {
        this.cpeUri = $.cpeUri;
        this.description = $.description;
        this.fixingKbs = $.fixingKbs;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsDetailArgs $;

        public Builder() {
            $ = new WindowsDetailArgs();
        }

        public Builder(WindowsDetailArgs defaults) {
            $ = new WindowsDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpeUri The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        /**
         * @param cpeUri The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        /**
         * @param description The description of this vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fixingKbs The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
         * 
         * @return builder
         * 
         */
        public Builder fixingKbs(Output<List<KnowledgeBaseArgs>> fixingKbs) {
            $.fixingKbs = fixingKbs;
            return this;
        }

        /**
         * @param fixingKbs The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
         * 
         * @return builder
         * 
         */
        public Builder fixingKbs(List<KnowledgeBaseArgs> fixingKbs) {
            return fixingKbs(Output.of(fixingKbs));
        }

        /**
         * @param fixingKbs The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
         * 
         * @return builder
         * 
         */
        public Builder fixingKbs(KnowledgeBaseArgs... fixingKbs) {
            return fixingKbs(List.of(fixingKbs));
        }

        /**
         * @param name The name of this vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WindowsDetailArgs build() {
            $.cpeUri = Objects.requireNonNull($.cpeUri, "expected parameter 'cpeUri' to be non-null");
            $.fixingKbs = Objects.requireNonNull($.fixingKbs, "expected parameter 'fixingKbs' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}