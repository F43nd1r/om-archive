
solution {
    puzzle = "P017"
    name = "H2"
    arm(ARM1) {
        number = 1
        position = -12 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -12 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -8 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -6 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 0 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -9 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -11 to 0
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(1 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                forward()
                forward()
                back()
                back()
                reset()
            }
        }
        )
    }
}
