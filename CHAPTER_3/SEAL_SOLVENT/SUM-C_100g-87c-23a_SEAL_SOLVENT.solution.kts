
solution {
    puzzle = "P026"
    name = "B S 6T"
    arm(ARM6) {
        number = 1
        position = 1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 4 to -1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
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
                drop()
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
                drop()
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
                drop()
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
                drop()
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
                drop()
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
                drop()
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
                grab()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        )
    }
}
