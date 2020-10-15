
solution {
    puzzle = "P056"
    name = "B ACX 6T"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                extend()
                extend()
                pivotClockwise()
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                reset()
                wait(2)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                extend()
                extend()
                pivotClockwise()
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
