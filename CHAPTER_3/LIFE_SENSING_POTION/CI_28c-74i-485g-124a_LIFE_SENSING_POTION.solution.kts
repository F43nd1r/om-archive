
solution {
    puzzle = "P030b"
    name = "B CI74"
    arm(ARM6) {
        number = 1
        position = -3 to 2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -5 to 5
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -3 to 4
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = -5 to 0
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 0 to -3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = 3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 5 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 5 to 0
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to -1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = -4 to 5
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        )
    }
}
