
solution {
    puzzle = "P099"
    name = "SUM4"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -5 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 6
        position = -4 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -7 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -4 to 0
        rotation = -3
        size = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 2
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -4 to -1
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = -3 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -7 to 2
        rotation = -1
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateClockwise()
                wait(8)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                forward()
                drop()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
            }
        }
        )
    }
}
