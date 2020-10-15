
solution {
    puzzle = "P075"
    name = "B X S"
    arm(ARM6) {
        number = 1
        position = -3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 6 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 5 to 6
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 5 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 9 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = 8 to 5
        rotation = 0
    }
    track {
        position = 5 to 6
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 5 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                extend()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                forward()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
