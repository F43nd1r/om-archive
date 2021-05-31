
solution {
    puzzle = "w2450512232"
    name = "B GG ROLAMNI"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 0 to -2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -2
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 1
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    conduit {
        id = 100
        position = 4 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to -3
        rotation = 0
    }
    conduit {
        id = 101
        position = 7 to -2
        rotation = 0
    }
    conduit {
        id = 101
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                back()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                grab()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
        
            }
        }
        )
    }
}
