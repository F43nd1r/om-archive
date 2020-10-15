
solution {
    puzzle = "P012"
    name = "W2.5 6T"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 6 to -3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 7 to -2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 1 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 7 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                reset()
            }
        }
        )
    }
}
