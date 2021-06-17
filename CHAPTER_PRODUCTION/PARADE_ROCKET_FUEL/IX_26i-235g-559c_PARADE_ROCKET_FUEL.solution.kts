
solution {
    puzzle = "P082"
    name = "26I"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 3 to 1
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 5 to 2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 3
        rotation = 0
    }
    track {
        position = 5 to 2
        positions = listOf(1 to -1, 0 to -1, 0 to 0, 0 to 1, 1 to 0)
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 1
    }
    conduit {
        id = 100
        position = 3 to 0
        rotation = -20
    }
    conduit {
        id = 101
        position = 4 to 3
        rotation = -12
    }
    conduit {
        id = 101
        position = 9 to 0
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                extend()
                forward()
                grab()
                forward()
                retract()
                retract()
                drop()
                extend()
            }
        }
        )
    }
}
