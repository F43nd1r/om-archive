
solution {
    puzzle = "P032"
    name = "B CI36G"
    arm(ARM2) {
        number = 1
        position = 1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 4 to -2
        rotation = -3
        size = 1
    }
    arm(ARM2) {
        number = 5
        position = -2 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to -1
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -5 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = -4
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 5 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -3
        rotation = -5
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
