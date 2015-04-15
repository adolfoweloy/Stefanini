/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bob.dashboard.web.beans;

import br.com.bob.dashboard.model.ClientReview;
import br.com.bob.dashboard.model.enums.Status;
import br.com.bob.dashboard.web.beans.util.MetricBean;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Vitor <vtr.oliveira at Nerv>
 */
@Named @RequestScoped
public class ClientReviewBean extends MetricBean<ClientReview> {

    public List<Status> getStatusList() {
        return Arrays.asList(Status.values());
    }
    
}