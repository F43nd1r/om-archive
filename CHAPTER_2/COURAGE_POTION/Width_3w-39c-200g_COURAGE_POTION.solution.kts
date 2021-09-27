
solution {
    puzzle = "P021"
    name = "W3"
    arm(ARM1) {
        number = 1
        position = -2 to -3
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -2
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -1 to -2
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = 3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(0 to -1, 1 to -1, 1 to 0, 0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                forward()
                grab()
                back()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
