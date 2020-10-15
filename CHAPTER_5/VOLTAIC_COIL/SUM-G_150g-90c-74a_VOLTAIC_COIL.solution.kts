
solution {
    puzzle = "P039"
    name = "B X S 6T"
    arm(ARM6) {
        number = 1
        position = -1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -3
        rotation = 0
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
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
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
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
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                back()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                reset()
                wait(2)
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
