package com.example.modulepublisher.mapper;

import com.example.modulepublisher.dto.LabelDTO;
import com.example.modulepublisher.entity.Label;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-15T17:14:04+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class LabelMapperImpl implements LabelMapper {

    @Override
    public Label toLabel(LabelDTO labelDTO) {
        if ( labelDTO == null ) {
            return null;
        }

        Label label = new Label();

        label.setId( labelDTO.getId() );
        label.setName( labelDTO.getName() );

        return label;
    }

    @Override
    public LabelDTO toLabelDTO(Label label) {
        if ( label == null ) {
            return null;
        }

        LabelDTO labelDTO = new LabelDTO();

        labelDTO.setId( label.getId() );
        labelDTO.setName( label.getName() );

        return labelDTO;
    }

    @Override
    public List<LabelDTO> toLabelDTOList(List<Label> labels) {
        if ( labels == null ) {
            return null;
        }

        List<LabelDTO> list = new ArrayList<LabelDTO>( labels.size() );
        for ( Label label : labels ) {
            list.add( toLabelDTO( label ) );
        }

        return list;
    }

    @Override
    public List<Label> toLabelList(List<LabelDTO> labelDTOS) {
        if ( labelDTOS == null ) {
            return null;
        }

        List<Label> list = new ArrayList<Label>( labelDTOS.size() );
        for ( LabelDTO labelDTO : labelDTOS ) {
            list.add( toLabel( labelDTO ) );
        }

        return list;
    }
}
