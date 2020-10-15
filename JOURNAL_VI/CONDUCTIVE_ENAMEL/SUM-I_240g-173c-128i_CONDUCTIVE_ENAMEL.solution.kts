
solution {
    puzzle = "P093"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = 0 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 11 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 8 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 10 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 11 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    conduit {
        id = 100
        position = 11 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(8)
                grab()
                retract()
                pivotClockwise()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                pivotClockwise()
                retract()
                wait(1)
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                pivotClockwise()
                retract()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                wait(1)
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
                wait(9)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
