
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 4"
    arm(PISTON) {
        number = 1
        position = -4 to -5
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -6
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -1 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -5
        rotation = -2
        size = 1
    }
    glyph(UNBONDER) {
        position = -5 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -3 to -4
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 0 to -5
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -7 to -5
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -4
        rotation = 0
    }
    track {
        position = -4 to -5
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -3 to -6
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 0 to -4
        positions = listOf(-1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                retract()
                wait(1)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                wait(5)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                forward()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                wait(3)
                back()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(32)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
