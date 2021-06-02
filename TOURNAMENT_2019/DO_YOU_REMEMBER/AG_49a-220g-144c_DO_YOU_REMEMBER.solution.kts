
solution {
    puzzle = "w1698787731"
    name = "B S F PENTAPIG"
    arm(ARM1) {
        number = 1
        position = 7 to -6
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -3
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 0 to -4
        rotation = -1
    }
    glyph(DISPERSION) {
        position = 3 to -2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 5 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -2 to 0
        rotation = 9
    }
    io(INPUT) {
        index = 3
        position = -1 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
