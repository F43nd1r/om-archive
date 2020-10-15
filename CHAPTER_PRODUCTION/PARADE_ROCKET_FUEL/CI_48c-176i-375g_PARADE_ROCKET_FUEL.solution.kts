
solution {
    puzzle = "P082"
    name = "B CI NOGIF"
    arm(PISTON) {
        number = 1
        position = 1 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to 1
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 6 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 3 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 0 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -2 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 2 to 4
        rotation = -1
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    conduit {
        id = 100
        position = 2 to 3
        rotation = 1
    }
    conduit {
        id = 100
        position = -1 to 1
        rotation = -3
    }
    conduit {
        id = 101
        position = 8 to 0
        rotation = 0
    }
    conduit {
        id = 101
        position = 4 to 1
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(7)
                grab()
                drop()
                wait(1)
                retract()
                rotateClockwise()
                grab()
                pivotClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(5)
                grab()
                pivotClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(5)
                grab()
                pivotClockwise()
                extend()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotClockwise()
                retract()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                pivotClockwise()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                forward()
                wait(2)
                back()
                reset()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                extend()
                wait(3)
                grab()
                back()
                forward()
                wait(8)
                retract()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                grab()
                retract()
                wait(4)
                extend()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                pivotClockwise()
                retract()
                retract()
                reset()
                wait(7)
                repeat()
                wait(11)
                grab()
                pivotClockwise()
                retract()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                forward()
                wait(2)
                back()
                reset()
                wait(1)
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                retract()
                wait(2)
                rotateClockwise()
                back()
                forward()
                wait(3)
                drop()
                extend()
                wait(8)
                grab()
                retract()
                drop()
            }
        }
        )
    }
}
