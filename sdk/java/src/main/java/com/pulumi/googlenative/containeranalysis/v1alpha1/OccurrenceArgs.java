// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.AttestationArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.BuildDetailsArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.ComplianceOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DSSEAttestationOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DeploymentArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DerivedArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DiscoveredArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DocumentOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.FileOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.InstallationArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.PackageInfoOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.RelationshipOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.ResourceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.UpgradeOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.VulnerabilityDetailsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Import(name="attestation")
    private @Nullable Output<AttestationArgs> attestation;

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public Optional<Output<AttestationArgs>> attestation() {
        return Optional.ofNullable(this.attestation);
    }

    /**
     * Build details for a verifiable build.
     * 
     */
    @Import(name="buildDetails")
    private @Nullable Output<BuildDetailsArgs> buildDetails;

    /**
     * @return Build details for a verifiable build.
     * 
     */
    public Optional<Output<BuildDetailsArgs>> buildDetails() {
        return Optional.ofNullable(this.buildDetails);
    }

    /**
     * Describes whether or not a resource passes compliance checks.
     * 
     */
    @Import(name="compliance")
    private @Nullable Output<ComplianceOccurrenceArgs> compliance;

    /**
     * @return Describes whether or not a resource passes compliance checks.
     * 
     */
    public Optional<Output<ComplianceOccurrenceArgs>> compliance() {
        return Optional.ofNullable(this.compliance);
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Import(name="deployment")
    private @Nullable Output<DeploymentArgs> deployment;

    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public Optional<Output<DeploymentArgs>> deployment() {
        return Optional.ofNullable(this.deployment);
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Import(name="derivedImage")
    private @Nullable Output<DerivedArgs> derivedImage;

    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public Optional<Output<DerivedArgs>> derivedImage() {
        return Optional.ofNullable(this.derivedImage);
    }

    /**
     * Describes the initial scan status for this resource.
     * 
     */
    @Import(name="discovered")
    private @Nullable Output<DiscoveredArgs> discovered;

    /**
     * @return Describes the initial scan status for this resource.
     * 
     */
    public Optional<Output<DiscoveredArgs>> discovered() {
        return Optional.ofNullable(this.discovered);
    }

    /**
     * This represents a DSSE attestation occurrence
     * 
     */
    @Import(name="dsseAttestation")
    private @Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation;

    /**
     * @return This represents a DSSE attestation occurrence
     * 
     */
    public Optional<Output<DSSEAttestationOccurrenceArgs>> dsseAttestation() {
        return Optional.ofNullable(this.dsseAttestation);
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @Import(name="envelope")
    private @Nullable Output<EnvelopeArgs> envelope;

    /**
     * @return https://github.com/secure-systems-lab/dsse
     * 
     */
    public Optional<Output<EnvelopeArgs>> envelope() {
        return Optional.ofNullable(this.envelope);
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Import(name="installation")
    private @Nullable Output<InstallationArgs> installation;

    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public Optional<Output<InstallationArgs>> installation() {
        return Optional.ofNullable(this.installation);
    }

    /**
     * The name of the project. Should be of the form &#34;projects/{project_id}&#34;. @Deprecated
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the project. Should be of the form &#34;projects/{project_id}&#34;. @Deprecated
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
     * 
     */
    @Import(name="noteName")
    private @Nullable Output<String> noteName;

    /**
     * @return An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
     * 
     */
    public Optional<Output<String>> noteName() {
        return Optional.ofNullable(this.noteName);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
     */
    @Import(name="remediation")
    private @Nullable Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the `Note`
     * 
     */
    public Optional<Output<String>> remediation() {
        return Optional.ofNullable(this.remediation);
    }

    /**
     *  The resource for which the `Occurrence` applies.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<ResourceArgs> resource;

    /**
     * @return  The resource for which the `Occurrence` applies.
     * 
     */
    public Optional<Output<ResourceArgs>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    @Import(name="resourceUrl")
    private @Nullable Output<String> resourceUrl;

    /**
     * @return The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    public Optional<Output<String>> resourceUrl() {
        return Optional.ofNullable(this.resourceUrl);
    }

    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @Import(name="sbom")
    private @Nullable Output<DocumentOccurrenceArgs> sbom;

    /**
     * @return Describes a specific software bill of materials document.
     * 
     */
    public Optional<Output<DocumentOccurrenceArgs>> sbom() {
        return Optional.ofNullable(this.sbom);
    }

    /**
     * Describes a specific SPDX File.
     * 
     */
    @Import(name="spdxFile")
    private @Nullable Output<FileOccurrenceArgs> spdxFile;

    /**
     * @return Describes a specific SPDX File.
     * 
     */
    public Optional<Output<FileOccurrenceArgs>> spdxFile() {
        return Optional.ofNullable(this.spdxFile);
    }

    /**
     * Describes a specific SPDX Package.
     * 
     */
    @Import(name="spdxPackage")
    private @Nullable Output<PackageInfoOccurrenceArgs> spdxPackage;

    /**
     * @return Describes a specific SPDX Package.
     * 
     */
    public Optional<Output<PackageInfoOccurrenceArgs>> spdxPackage() {
        return Optional.ofNullable(this.spdxPackage);
    }

    /**
     * Describes a specific relationship between SPDX elements.
     * 
     */
    @Import(name="spdxRelationship")
    private @Nullable Output<RelationshipOccurrenceArgs> spdxRelationship;

    /**
     * @return Describes a specific relationship between SPDX elements.
     * 
     */
    public Optional<Output<RelationshipOccurrenceArgs>> spdxRelationship() {
        return Optional.ofNullable(this.spdxRelationship);
    }

    /**
     * Describes an upgrade.
     * 
     */
    @Import(name="upgrade")
    private @Nullable Output<UpgradeOccurrenceArgs> upgrade;

    /**
     * @return Describes an upgrade.
     * 
     */
    public Optional<Output<UpgradeOccurrenceArgs>> upgrade() {
        return Optional.ofNullable(this.upgrade);
    }

    /**
     * Details of a security vulnerability note.
     * 
     */
    @Import(name="vulnerabilityDetails")
    private @Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails;

    /**
     * @return Details of a security vulnerability note.
     * 
     */
    public Optional<Output<VulnerabilityDetailsArgs>> vulnerabilityDetails() {
        return Optional.ofNullable(this.vulnerabilityDetails);
    }

    private OccurrenceArgs() {}

    private OccurrenceArgs(OccurrenceArgs $) {
        this.attestation = $.attestation;
        this.buildDetails = $.buildDetails;
        this.compliance = $.compliance;
        this.deployment = $.deployment;
        this.derivedImage = $.derivedImage;
        this.discovered = $.discovered;
        this.dsseAttestation = $.dsseAttestation;
        this.envelope = $.envelope;
        this.installation = $.installation;
        this.name = $.name;
        this.noteName = $.noteName;
        this.project = $.project;
        this.remediation = $.remediation;
        this.resource = $.resource;
        this.resourceUrl = $.resourceUrl;
        this.sbom = $.sbom;
        this.spdxFile = $.spdxFile;
        this.spdxPackage = $.spdxPackage;
        this.spdxRelationship = $.spdxRelationship;
        this.upgrade = $.upgrade;
        this.vulnerabilityDetails = $.vulnerabilityDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurrenceArgs $;

        public Builder() {
            $ = new OccurrenceArgs();
        }

        public Builder(OccurrenceArgs defaults) {
            $ = new OccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(@Nullable Output<AttestationArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(AttestationArgs attestation) {
            return attestation(Output.of(attestation));
        }

        /**
         * @param buildDetails Build details for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder buildDetails(@Nullable Output<BuildDetailsArgs> buildDetails) {
            $.buildDetails = buildDetails;
            return this;
        }

        /**
         * @param buildDetails Build details for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder buildDetails(BuildDetailsArgs buildDetails) {
            return buildDetails(Output.of(buildDetails));
        }

        /**
         * @param compliance Describes whether or not a resource passes compliance checks.
         * 
         * @return builder
         * 
         */
        public Builder compliance(@Nullable Output<ComplianceOccurrenceArgs> compliance) {
            $.compliance = compliance;
            return this;
        }

        /**
         * @param compliance Describes whether or not a resource passes compliance checks.
         * 
         * @return builder
         * 
         */
        public Builder compliance(ComplianceOccurrenceArgs compliance) {
            return compliance(Output.of(compliance));
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(@Nullable Output<DeploymentArgs> deployment) {
            $.deployment = deployment;
            return this;
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(DeploymentArgs deployment) {
            return deployment(Output.of(deployment));
        }

        /**
         * @param derivedImage Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder derivedImage(@Nullable Output<DerivedArgs> derivedImage) {
            $.derivedImage = derivedImage;
            return this;
        }

        /**
         * @param derivedImage Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder derivedImage(DerivedArgs derivedImage) {
            return derivedImage(Output.of(derivedImage));
        }

        /**
         * @param discovered Describes the initial scan status for this resource.
         * 
         * @return builder
         * 
         */
        public Builder discovered(@Nullable Output<DiscoveredArgs> discovered) {
            $.discovered = discovered;
            return this;
        }

        /**
         * @param discovered Describes the initial scan status for this resource.
         * 
         * @return builder
         * 
         */
        public Builder discovered(DiscoveredArgs discovered) {
            return discovered(Output.of(discovered));
        }

        /**
         * @param dsseAttestation This represents a DSSE attestation occurrence
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(@Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation) {
            $.dsseAttestation = dsseAttestation;
            return this;
        }

        /**
         * @param dsseAttestation This represents a DSSE attestation occurrence
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(DSSEAttestationOccurrenceArgs dsseAttestation) {
            return dsseAttestation(Output.of(dsseAttestation));
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            $.envelope = envelope;
            return this;
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(EnvelopeArgs envelope) {
            return envelope(Output.of(envelope));
        }

        /**
         * @param installation Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder installation(@Nullable Output<InstallationArgs> installation) {
            $.installation = installation;
            return this;
        }

        /**
         * @param installation Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder installation(InstallationArgs installation) {
            return installation(Output.of(installation));
        }

        /**
         * @param name The name of the project. Should be of the form &#34;projects/{project_id}&#34;. @Deprecated
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the project. Should be of the form &#34;projects/{project_id}&#34;. @Deprecated
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param noteName An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(@Nullable Output<String> noteName) {
            $.noteName = noteName;
            return this;
        }

        /**
         * @param noteName An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(String noteName) {
            return noteName(Output.of(noteName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the `Note`
         * 
         * @return builder
         * 
         */
        public Builder remediation(@Nullable Output<String> remediation) {
            $.remediation = remediation;
            return this;
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the `Note`
         * 
         * @return builder
         * 
         */
        public Builder remediation(String remediation) {
            return remediation(Output.of(remediation));
        }

        /**
         * @param resource  The resource for which the `Occurrence` applies.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<ResourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource  The resource for which the `Occurrence` applies.
         * 
         * @return builder
         * 
         */
        public Builder resource(ResourceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param resourceUrl The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(@Nullable Output<String> resourceUrl) {
            $.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * @param resourceUrl The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(String resourceUrl) {
            return resourceUrl(Output.of(resourceUrl));
        }

        /**
         * @param sbom Describes a specific software bill of materials document.
         * 
         * @return builder
         * 
         */
        public Builder sbom(@Nullable Output<DocumentOccurrenceArgs> sbom) {
            $.sbom = sbom;
            return this;
        }

        /**
         * @param sbom Describes a specific software bill of materials document.
         * 
         * @return builder
         * 
         */
        public Builder sbom(DocumentOccurrenceArgs sbom) {
            return sbom(Output.of(sbom));
        }

        /**
         * @param spdxFile Describes a specific SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(@Nullable Output<FileOccurrenceArgs> spdxFile) {
            $.spdxFile = spdxFile;
            return this;
        }

        /**
         * @param spdxFile Describes a specific SPDX File.
         * 
         * @return builder
         * 
         */
        public Builder spdxFile(FileOccurrenceArgs spdxFile) {
            return spdxFile(Output.of(spdxFile));
        }

        /**
         * @param spdxPackage Describes a specific SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(@Nullable Output<PackageInfoOccurrenceArgs> spdxPackage) {
            $.spdxPackage = spdxPackage;
            return this;
        }

        /**
         * @param spdxPackage Describes a specific SPDX Package.
         * 
         * @return builder
         * 
         */
        public Builder spdxPackage(PackageInfoOccurrenceArgs spdxPackage) {
            return spdxPackage(Output.of(spdxPackage));
        }

        /**
         * @param spdxRelationship Describes a specific relationship between SPDX elements.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(@Nullable Output<RelationshipOccurrenceArgs> spdxRelationship) {
            $.spdxRelationship = spdxRelationship;
            return this;
        }

        /**
         * @param spdxRelationship Describes a specific relationship between SPDX elements.
         * 
         * @return builder
         * 
         */
        public Builder spdxRelationship(RelationshipOccurrenceArgs spdxRelationship) {
            return spdxRelationship(Output.of(spdxRelationship));
        }

        /**
         * @param upgrade Describes an upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(@Nullable Output<UpgradeOccurrenceArgs> upgrade) {
            $.upgrade = upgrade;
            return this;
        }

        /**
         * @param upgrade Describes an upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(UpgradeOccurrenceArgs upgrade) {
            return upgrade(Output.of(upgrade));
        }

        /**
         * @param vulnerabilityDetails Details of a security vulnerability note.
         * 
         * @return builder
         * 
         */
        public Builder vulnerabilityDetails(@Nullable Output<VulnerabilityDetailsArgs> vulnerabilityDetails) {
            $.vulnerabilityDetails = vulnerabilityDetails;
            return this;
        }

        /**
         * @param vulnerabilityDetails Details of a security vulnerability note.
         * 
         * @return builder
         * 
         */
        public Builder vulnerabilityDetails(VulnerabilityDetailsArgs vulnerabilityDetails) {
            return vulnerabilityDetails(Output.of(vulnerabilityDetails));
        }

        public OccurrenceArgs build() {
            return $;
        }
    }

}