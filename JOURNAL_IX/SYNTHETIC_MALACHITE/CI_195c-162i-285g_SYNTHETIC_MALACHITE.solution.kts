
solution {
    puzzle = "P109"
    name = "B CC"
    arm(PISTON) {
        number = 1
        position = 4 to 4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to 7
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 4 to 5
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 10 to 4
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 7 to 4
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 7 to 3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 8 to 2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 6 to 6
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 4 to 6
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 5 to 5
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to 7
        rotation = 0
    }
    track {
        position = 7 to 3
        positions = listOf(1 to 0, 1 to -1, 0 to 0, 0 to 1, 1 to 1)
    }
    conduit {
        id = 100
        position = 2 to 6
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to 6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                reset()
                wait(2)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(20)
                grab()
                retract()
                wait(1)
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        )
    }
}
