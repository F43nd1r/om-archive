
solution {
    puzzle = "P013"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = 1 to 0
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to -4
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    track {
        position = -3 to -4
        positions = listOf(0 to -1, 1 to -1, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(11)
                grab()
                retract()
                back()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
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
                retract()
                wait(1)
                extend()
                reset()
            }
        }
        )
    }
}
