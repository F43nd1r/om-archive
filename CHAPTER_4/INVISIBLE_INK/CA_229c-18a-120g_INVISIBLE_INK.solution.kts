
solution {
    puzzle = "P032"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 4
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
