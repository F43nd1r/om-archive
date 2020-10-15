
solution {
    puzzle = "P014"
    name = "W3"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -3 to -4
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -4 to -4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to -6
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -1 to -4
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -1 to -5
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
