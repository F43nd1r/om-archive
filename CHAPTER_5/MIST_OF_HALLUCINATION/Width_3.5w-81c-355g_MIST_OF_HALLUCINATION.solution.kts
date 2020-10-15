
solution {
    puzzle = "P038"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = -4 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -4
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 2 to 3
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to -2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to -2
        rotation = 0
    }
    track {
        position = -6 to -1
        positions = listOf(2 to 0, 1 to 0, 1 to -1, 2 to -2, 2 to -3, 3 to -3, 3 to -2)
    }
    track {
        position = 1 to 1
        positions = listOf(-1 to 0, 0 to -1)
    }
    track {
        position = 2 to 4
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                extend()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                drop()
                extend()
                wait(2)
                grab()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                grab()
                retract()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
