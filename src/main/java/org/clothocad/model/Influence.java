/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clothocad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
*
* @author Nicholas Roehner
*/
@NoArgsConstructor
public class Influence extends SharableObjBase {

    @NotNull
    @Getter
    @Setter
    //@Reference
    protected Feature influencingFeature;

    @NotNull
    @Getter
    @Setter
    //@Reference
    protected Feature influencedFeature;

    @NotNull
    @Getter
    @Setter
    protected InfluenceType type;

    @Getter
    @Setter
    //@Reference
    protected Influence parentInfluence;

    public Influence(String name, Feature influencingFeature, Feature influencedFeature,
            InfluenceType type, Person author) {
        super(name, author);
        this.influencingFeature = influencingFeature;
        this.influencedFeature = influencedFeature;
        this.type = type;
    }

    public Influence(String name, String description, Feature influencingFeature, Feature influencedFeature,
            InfluenceType type, Person author) {
        super(name, author, description);
        this.influencingFeature = influencingFeature;
        this.influencedFeature = influencedFeature;
        this.type = type;
    }

    // Feel free to add more of these
    public static enum InfluenceType {
        REPRESSION, ACTIVATION;
    }

}