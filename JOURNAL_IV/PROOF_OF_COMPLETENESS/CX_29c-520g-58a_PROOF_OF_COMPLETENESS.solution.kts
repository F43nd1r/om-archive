
solution {
    puzzle = "P069"
    name = "B CX 2T"
    arm(ARM1) {
        number = 1
        position = -2 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -6 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 1 to -5
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = 2 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -2 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -5 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -6 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -4 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -4 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 16
        position = 0 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -3 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 3
        position = -6 to 0
        rotation = 1
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -2 to -6
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -6 to 3
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
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
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(14) {
                wait(8)
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        )
    }
}
