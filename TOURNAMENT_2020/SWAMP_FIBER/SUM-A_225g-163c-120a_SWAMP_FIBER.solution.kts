
solution {
    puzzle = "w2501727889"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -12 to -9
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -15 to -6
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -12 to -7
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -13 to -5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -9 to -9
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -10 to -8
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -7 to -6
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -12 to -6
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -12 to -8
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -13 to -8
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = 16 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -9
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -14 to -6
        rotation = 0
    }
    track {
        position = -15 to -6
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -6 to -8
        positions = listOf(-4 to 0, -3 to 0, -2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
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
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(23)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(8)
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(32)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(15)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(16)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(26)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(36)
                grab()
                pivotClockwise()
                wait(2)
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                forward()
                reset()
                wait(10)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(16)
                grab()
                pivotClockwise()
                wait(1)
                forward()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                forward()
                reset()
                wait(8)
                rotateClockwise()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
