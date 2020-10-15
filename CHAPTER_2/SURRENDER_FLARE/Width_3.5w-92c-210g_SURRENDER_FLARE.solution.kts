
solution {
    puzzle = "P022"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = -9 to -6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -5 to -2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -1 to -1
        rotation = -8
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = -4
    }
    glyph(PROJECTION) {
        position = -2 to -3
        rotation = 8
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -5
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -4
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = -10 to -5
        positions = listOf(2 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -2 to -3
        positions = listOf(2 to 4, 1 to 4, 0 to 4, 0 to 3, -1 to 3, -1 to 2, -2 to 2, -2 to 1, -3 to 1)
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                back()
                back()
                back()
                back()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
