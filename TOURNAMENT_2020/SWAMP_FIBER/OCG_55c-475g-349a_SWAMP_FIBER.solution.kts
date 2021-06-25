
solution {
    puzzle = "w2501727889"
    name = "B CG F43ND1R"
    arm(ARM1) {
        number = 1
        position = 3 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -4 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 4 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 6 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 4 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 3 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 2 to 3
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 1, 1 to 0)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -1 to 2, 0 to 1)
    }
    track {
        position = 3 to -6
        positions = listOf(-2 to 2, -2 to 3, -1 to 3)
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                forward()
                wait(2)
                rotateCounterClockwise()
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(14)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(9)
                forward()
                forward()
                wait(2)
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(9)
                forward()
                wait(2)
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(9)
                forward()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(13)
                forward()
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(4)
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                wait(4)
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(4)
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                wait(4)
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                back()
                grab()
                forward()
                reset()
                wait(2)
                back()
                grab()
                forward()
                drop()
                wait(8)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                wait(3)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(4)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                back()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                forward()
                reset()
                wait(5)
                repeat()
                wait(17)
                repeat()
            }
        }
        )
    }
}
