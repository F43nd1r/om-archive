
solution {
    puzzle = "P021"
    name = "W3"
    arm(PISTON) {
        number = 1
        position = -1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -2
        rotation = 12
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to -3
        rotation = 13
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -4
        rotation = 13
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to 0
        rotation = 3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 6
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 0 to -4
        positions = listOf(-2 to 2, -1 to 1, 0 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                extend()
                reset()
            }
        }
        )
    }
}
