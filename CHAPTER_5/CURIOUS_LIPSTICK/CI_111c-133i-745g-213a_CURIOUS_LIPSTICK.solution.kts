
solution {
    puzzle = "P041"
    name = "B CI133"
    arm(ARM6) {
        number = 1
        position = 0 to -7
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -8
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -7
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -7
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 1 to -6
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 0 to -6
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -5 to -1
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = -3 to -4
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = -6 to 0
        rotation = 6
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = -1 to -8
        rotation = 5
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 11
        position = 4 to -5
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 12
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 13
        position = 3 to -1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 14
        position = 3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 15
        position = -1 to 1
        rotation = 6
        size = 2
    }
    arm(ARM6) {
        number = 16
        position = -2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 2 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 3 to -5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to -4
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -1 to -5
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 3
    }
    glyph(DISPOSAL) {
        position = -3 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -5
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 1, -1 to 1, -1 to 2, -2 to 2)
    }
    track {
        position = 1 to -6
        positions = listOf(1 to 0, 1 to -1, 0 to -1, 0 to -2, 1 to -2, 2 to -2, 3 to -2)
    }
    tape {
        parallel(
        {
            sequence(12) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                back()
                forward()
                drop()
                back()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(3)
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(17) {
                wait(5)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(7)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
