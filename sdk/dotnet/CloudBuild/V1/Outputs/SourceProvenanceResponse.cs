// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudBuild.V1.Outputs
{

    /// <summary>
    /// Provenance of the source. Ways to find the original source, or verify that some source was used for this build.
    /// </summary>
    [OutputType]
    public sealed class SourceProvenanceResponse
    {
        /// <summary>
        /// Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
        /// </summary>
        public readonly ImmutableDictionary<string, string> FileHashes;
        /// <summary>
        /// A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
        /// </summary>
        public readonly Outputs.RepoSourceResponse ResolvedRepoSource;
        /// <summary>
        /// A copy of the build's `source.storage_source`, if exists, with any generations resolved.
        /// </summary>
        public readonly Outputs.StorageSourceResponse ResolvedStorageSource;
        /// <summary>
        /// A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
        /// </summary>
        public readonly Outputs.StorageSourceManifestResponse ResolvedStorageSourceManifest;

        [OutputConstructor]
        private SourceProvenanceResponse(
            ImmutableDictionary<string, string> fileHashes,

            Outputs.RepoSourceResponse resolvedRepoSource,

            Outputs.StorageSourceResponse resolvedStorageSource,

            Outputs.StorageSourceManifestResponse resolvedStorageSourceManifest)
        {
            FileHashes = fileHashes;
            ResolvedRepoSource = resolvedRepoSource;
            ResolvedStorageSource = resolvedStorageSource;
            ResolvedStorageSourceManifest = resolvedStorageSourceManifest;
        }
    }
}