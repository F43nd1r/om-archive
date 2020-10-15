
solution {
    puzzle = "P036"
    name = "B X ACX"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 1
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 0 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
