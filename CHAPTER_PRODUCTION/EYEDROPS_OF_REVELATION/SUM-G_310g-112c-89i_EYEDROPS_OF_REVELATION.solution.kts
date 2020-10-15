
solution {
    puzzle = "P081"
    name = "B X S"
    arm(PISTON) {
        number = 1
        position = 1 to 5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 6 to 1
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 5 to 4
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 12 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 8 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 10 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 5 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to 4
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 11 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 2
        rotation = 7
    }
    track {
        position = 1 to 4
        positions = listOf(0 to 0, 0 to -1)
    }
    conduit {
        id = 100
        position = -1 to 5
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to 2
        rotation = 0
    }
    conduit {
        id = 101
        position = 4 to 4
        rotation = 0
    }
    conduit {
        id = 101
        position = 9 to 1
        rotation = 3
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                wait(1)
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                extend()
                forward()
                reset()
                wait(2)
                grab()
                extend()
                forward()
                retract()
                wait(1)
                extend()
                retract()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                retract()
                rotateClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                reset()
            }
        }
        )
    }
}
