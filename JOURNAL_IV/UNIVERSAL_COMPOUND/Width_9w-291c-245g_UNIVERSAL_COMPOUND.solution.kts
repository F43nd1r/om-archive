
solution {
    puzzle = "P072"
    name = "621+155=776"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 3
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 3
        rotation = -3
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 0 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to 2
        rotation = -4
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 5
        rotation = -6
    }
    glyph(UNIFICATION) {
        position = -1 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 2
        rotation = 2
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = 3 to 2
        positions = listOf(-2 to 1, -1 to 0, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                drop()
                back()
                wait(1)
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(5)
                rotateClockwise()
                rotateClockwise()
                wait(4)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(17)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                wait(8)
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                wait(1)
                forward()
                pivotCounterClockwise()
                wait(2)
                back()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                reset()
                wait(7)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
