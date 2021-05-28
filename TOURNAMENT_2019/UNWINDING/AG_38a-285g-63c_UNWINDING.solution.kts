
solution {
    puzzle = "w1611998067"
    name = "H"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 2 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 3 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 4 to -2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 0
        rotation = 0
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(6 to -1, 5 to -1, 4 to -1, 3 to -1, 2 to -1, 1 to -1, 0 to -1, 0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(6)
                forward()
                grab()
                forward()
                drop()
                back()
                wait(2)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                extend()
                wait(2)
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                extend()
                wait(2)
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(6)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                extend()
                wait(2)
                repeat()
            }
        }
        )
    }
}
