
solution {
    puzzle = "P036"
    name = "B S 7T WHEEL"
    arm(ARM6) {
        number = 1
        position = -4 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to 0
        rotation = 0
        size = 1
    }
    glyph(PURIFICATION) {
        position = -4 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -3 to 2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -1 to 2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 2 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
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
        position = -2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
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
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
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
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
