
solution {
    puzzle = "w2501727721"
    name = "NEW SOLUTION 1"
    arm(PISTON) {
        number = 1
        position = -11 to -6
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -11 to -8
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -8 to -8
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -9 to -8
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -4 to -6
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -15 to -7
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -12 to -7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -7
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -9 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -17 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -8
        rotation = 0
    }
    track {
        position = -10 to -6
        positions = listOf(-1 to 0, -2 to 0, -3 to 0, -3 to -1, -4 to -1)
    }
    track {
        position = -11 to -8
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0)
    }
    track {
        position = -8 to -8
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -4 to -6
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                wait(1)
                forward()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                forward()
                wait(1)
                grab()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                wait(3)
                forward()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                forward()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                reset()
            }
        }
        )
    }
}
