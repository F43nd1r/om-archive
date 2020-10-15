
solution {
    puzzle = "P022"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -8 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 5 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 7 to 2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 2 to 2
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to 0
        rotation = 0
    }
    track {
        position = -6 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 3 to 0
        positions = listOf(1 to 2, 2 to 2, 3 to 2, 4 to 2, 4 to 1, 3 to 1, 2 to 1, 1 to 1, 2 to 0, 1 to 0, 0 to 0, -1 to 0, -2 to 0)
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
                retract()
                retract()
                back()
                back()
                back()
                back()
                forward()
                drop()
                wait(3)
                grab()
                forward()
                forward()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                back()
                wait(1)
                rotateClockwise()
                back()
                drop()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                back()
                grab()
                forward()
                forward()
                forward()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
